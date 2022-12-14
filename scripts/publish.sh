#!/usr/bin/env bash

set -o pipefail

BUILD_TYPE="${1-Release}"
PLAY_PUBLISH_PASSWORD=$2

REPO_DIR="$(cd "$(dirname "$0")/../" && pwd)"

echo "Publishing Library Version: $VERSION"
# Publish Libraries
"${REPO_DIR}"/gradlew assemble"${BUILD_TYPE}" publish

# Verify decrypting password
if [[ -z "${PLAY_PUBLISH_PASSWORD}" ]]; then
	echo "No password given. Abort"
	exit 1
fi

# Create Google Play json for publishing
echo "Creating Google Play Publish json"
./scripts/decrypt.sh pc-api-6516078326128720260-777-76bc229fe079.json.aes-256-cbc.enc.b64 \
    pc-api-6516078326128720260-777-76bc229fe079.json "${PLAY_PUBLISH_PASSWORD}"

echo "Publishing Bundle Version: $VERSION"
# Publish App
"${REPO_DIR}"/gradlew -p "$REPO_DIR" publish"${BUILD_TYPE}"Bundle --info

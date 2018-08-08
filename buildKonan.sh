#!/bin/sh
./gradlew -p "./golden-ios-common" "compileKonanGoldenIos_arm64" \
-Pkonan.configuration.build.dir="$CONFIGURATION_BUILD_DIR"        \
-Pkonan.debugging.symbols="YES"                    \
-Pkonan.optimizations.enable="NO"

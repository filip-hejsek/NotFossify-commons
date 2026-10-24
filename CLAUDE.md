# NotFossify Commons (personal fork)

A personal fork of Fossify Commons (upstream: `FossifyOrg/Commons`), the shared library used by
Fossify apps. It exists to support the personal music player fork
(`filip-hejsek/music-player`); no effort goes into keeping it usable for other Fossify apps or a
general audience.

## Background

- Stack: Android library, Kotlin, Compose (About/FAQ/licences screens) and Views, Gradle.
- Keep the Maven coordinates (`org.fossify:commons`) and Kotlin package names (`org.fossify.commons`)
  so the music player can substitute this fork for the published artifact without code changes.
- Keep AGP/Kotlin versions in `gradle/libs.versions.toml` in sync with the music player: it builds
  this repo as an included build, which requires matching plugin versions.

## Use from the music player

The music player includes this repo as a git submodule (`notfossify-commons`, tracking `dev`) and
builds it as an included build; `-PcommonsDir=...` there points it at another checkout. After
pushing to `dev`, bump the submodule pointer in the music player.

## Changes from upstream

- Stripped down to what the music player uses: unused code (including class members) and
  resources were removed, along with the samples app and the upstream org infrastructure (CI
  workflows, dependabot, CODEOWNERS, contributing guide). When the music player needs something
  that was removed, restore it from `main` (which mirrors upstream).
- No anti-fork behavior: the "fake version" dialog, the package-name gates in the SAF handlers and
  the sideloading check (which pointed at a Play Store listing) are gone.
- No Fossify ecosystem integration or upsells: no rate/donate prompts, no Thank You app
  integration (global theme/font sync, purchase prompts), no Customize colors screen.
- The About screen shows only the FAQ, a source code link (`getRepositoryUrl()`, supplied by the
  app), third-party licences and the version.
- The app lock and protected/hidden folder features were removed (the music player had no settings
  to enable them), and with them the biometric and Reprint dependencies and PatternLockView. The
  latter was the only dependency requiring Jetifier, which is disabled.

## Git workflow

- `main` mirrors upstream; don't commit to it. Personal work goes on `dev`.
- Push nontrivial changes so they aren't lost. Push incomplete work to a new branch in the
  `claude/` namespace.
- Force-pushing is fine on branches Claude created, never on any other branch.

## Building

Build and verify through the music player (`./gradlew assembleDebug` there), since nothing in this
repo exercises the library on its own. Cloud sandboxes can build given an Android SDK
(`ANDROID_HOME`). The environment needs network access to `dl.google.com`, `jitpack.io` and Maven
Central; Maven Central may answer 429, in which case just rerun the build (downloads are cached).

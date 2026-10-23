# NotFossify Commons (personal fork)

A personal fork of Fossify Commons (upstream: `FossifyOrg/Commons`), the shared library used by
Fossify apps. It exists to support the personal music player fork
(`filip-hejsek/music-player`); no effort goes into keeping it usable for other Fossify apps or a
general audience.

## Background

- Stack: Android library, Kotlin (plus some vendored Java), Compose and Views, Room, Gradle.
- Keep the Maven coordinates (`org.fossify:commons`) and Kotlin package names (`org.fossify.commons`)
  so the music player can substitute this fork for the published artifact without code changes.
- Keep AGP/Kotlin/KSP versions in `gradle/libs.versions.toml` in sync with the music player:
  it builds this repo as an included build, which requires matching plugin versions.

## Use from the music player

The music player includes this repo as a git submodule (`notfossify-commons`, tracking `dev`) and
builds it as an included build; `-PcommonsDir=...` there points it at another checkout. After
pushing to `dev`, bump the submodule pointer in the music player.

## Changes from upstream

- PatternLockView (`com.andrognito.patternlockview`, Apache-2.0, upstream
  `aritraroy/PatternLockView` at `a90b0d4bf0`) is vendored into `commons/src/main/java`, migrated
  from the legacy support library to AndroidX. It was the only dependency requiring Jetifier, which
  is now disabled. Its resources live in `commons/src/main/res/values/patternlockview_*.xml`.

## Git workflow

- `main` mirrors upstream; don't commit to it. Personal work goes on `dev`.
- Push nontrivial changes so they aren't lost. Push incomplete work to a new branch in the
  `claude/` namespace.
- Force-pushing is fine on branches Claude created, never on any other branch.

## Building

Cloud sandboxes can build with `./gradlew :commons:assembleDebug :samples:assembleDebug`, given an
Android SDK (`ANDROID_HOME`). The environment needs network access to `dl.google.com`, `jitpack.io`
and Maven Central; Maven Central may answer 429, in which case just rerun the build (downloads are
cached).

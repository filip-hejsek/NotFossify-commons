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

## Local development with the music player

The music player opts in to building against a local checkout with the `commonsDir` Gradle
property (see its `settings.gradle.kts`), e.g. `-PcommonsDir=../notfossify-commons` or
`commonsDir=...` in `~/.gradle/gradle.properties`.

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

Cloud sandboxes usually have no Android SDK, so code there can't be compiled. Say so when handing
over uncompiled changes; the build is checked locally.

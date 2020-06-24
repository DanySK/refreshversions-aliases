# Automatic version aliasing and grouping for [refreshVersions](https://github.com/jmfayard/refreshVersions)

The goal of this project is to provide an automatic configuration of the great
[refreshVersions](https://github.com/jmfayard/refreshVersions) version management tool for Gradle.

## Use

TBD

## Problem description

By default, it controls versions in a `version.properties` files, with entries in the form:
``version.group..artifact=versionToUse``.
However, several artifacts may need to be version synchronized.
For instance, when using the [Alchemist simulator](https://alchemistsimulator.github.io),
versions of the core project and additional packages should be the same:
```
version.it.unibo.alchemist..alchemist=versionToUse
version.it.unibo.alchemist..alchemist-incarnation-protelis=versionToUse
```
Changing a single package version may cause misalignments and breackages.

This is especially true when automated package upgrades are configured,
e.g. via an [UpGradle bot](https://github.com/DanySK/upgradle).
Bots cannot discriminate the semantics behind a version upgrade,
an thus propose multiple separate pull requests.

This project provides a number of pre-defined aliases that group entries meant to share the same version, e.g.:
```
version.it.unibo.alchemist=versionToUse
```

## Contributing to the project

Contributions via pull request are welcome.
Each contribution must:
* Provide evidence that the alias points to the correct / most common version of the library for which the inclusion has been required
* Add at least two dependencies to the `src/test/resources/org/danilopianini/test/build.gradle.kts` file, thus
demonstrating that reason exists to group the dependencies in a single entry


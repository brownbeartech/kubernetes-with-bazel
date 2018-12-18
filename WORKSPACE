load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

git_repository(
    name = "bazel_skylib",
    remote = "https://github.com/bazelbuild/bazel-skylib.git",
    tag = "0.6.0",
)

git_repository(
    name = "io_bazel_rules_go",
    remote = "https://github.com/bazelbuild/rules_go.git",
    tag = "0.16.3",
)

load("@io_bazel_rules_go//go:def.bzl", "go_register_toolchains", "go_rules_dependencies")

go_rules_dependencies()

go_register_toolchains()

http_archive(
    name = "io_bazel_rules_docker",
    sha256 = "96eddb5705e0c6ca5e3e3d01638d667c460fb28ae8f458c2a17b77b8f1758138",
    strip_prefix = "rules_docker-e5785ceaef4eb7e0cc28bdb909fd1b10d5b991c3",
    urls = ["https://github.com/bazelbuild/rules_docker/archive/e5785ceaef4eb7e0cc28bdb909fd1b10d5b991c3.tar.gz"],
)

register_toolchains(
    "@io_bazel_rules_docker//toolchains/docker:default_linux_toolchain",
    "@io_bazel_rules_docker//toolchains/docker:default_windows_toolchain",
    "@io_bazel_rules_docker//toolchains/docker:default_osx_toolchain",
)

load(
    "@io_bazel_rules_docker//docker:docker.bzl",
    "docker_pull",
)

load(
    "@io_bazel_rules_docker//container:container.bzl",
    "container_pull",
    container_repositories = "repositories",
)

container_repositories()

git_repository(
    name = "io_bazel_rules_k8s",
    commit = "e2c0a72b04a4331716ea0f33a0ee1f810304d5ff",
    remote = "https://github.com/bazelbuild/rules_k8s.git",
)

load("@io_bazel_rules_k8s//k8s:k8s.bzl", "k8s_repositories")

k8s_repositories()

docker_pull(
    name = "debian8",
    # From tag: 2017-09-11-115552
    digest = "sha256:6d381d0bf292e31291136cff03b3209eb40ef6342fb790483fa1b9d3af84ae46",
    registry = "gcr.io",
    repository = "google-appengine/debian8",
)

git_repository(
    name = "structure_test",
    commit = "ed3dad4a36e3dea20f2000a28bff0cbf7007e5f9",
    remote = "https://github.com/GoogleCloudPlatform/container-structure-test.git",
)

git_repository(
    name = "runtimes_common",
    commit = "ede0eb8621987e9a7c4b1a1267c8b74e254d618a",
    remote = "https://github.com/GoogleCloudPlatform/runtimes-common.git",
)

git_repository(
  name = "distroless",
  remote = "https://github.com/GoogleContainerTools/distroless",
  commit = "446923c3756ceeaa75888f52fcbdd48bb314fbf8",
)

load(
    "@distroless//package_manager:package_manager.bzl",
    "package_manager_repositories",
    "dpkg_src",
    "dpkg_list",
)

package_manager_repositories()

dpkg_src(
    name = "debian_stretch",
    arch = "amd64",
    distro = "stretch",
    sha256 = "4cb2fac3e32292613b92d3162e99eb8a1ed7ce47d1b142852b0de3092b25910c",
    snapshot = "20180406T095535Z",
    url = "http://snapshot.debian.org/archive",
)

dpkg_list(
    name = "package_bundle",
    packages = [
        "base-files",
        "ca-certificates",
        "openjdk-8-jre-headless",
        "openssl",
        "python2.7-minimal",
        "ssh",
        "libc6",
        "libgcc1",
        "libgomp1",
        "libpython2.7-minimal",
        "libpython2.7-stdlib",
        "libssl1.1",
        "libstdc++6",
        "netbase",
        "tzdata",
        "zlib1g",
         # Add any other debian packages you need here.
    ],
    sources = [
        "@debian_stretch//file:Packages.json",
    ],
)

maven_jar(
    name = "io_undertow_core",
    artifact = "io.undertow:undertow-core:2.0.13.Final"
)

maven_jar(
    name = "io_undertow_websockets_jsr",
    artifact = "io.undertow:undertow-websockets-jsr:2.0.13.Final"
)

maven_jar(
    name = "org_jboss_xnio_api",
    artifact = "org.jboss.xnio:xnio-api:3.3.8.Final"
)

maven_jar(
    name = "org_jboss_xnio_nio",
    artifact = "org.jboss.xnio:xnio-nio:3.3.8.Final"
)

maven_jar(
    name = "org_jboss_logging",
    artifact = "org.jboss.logging:jboss-logging:3.3.2.Final"
)

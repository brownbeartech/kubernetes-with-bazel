package(default_visibility = ["//visibility:public"])

load("@io_bazel_rules_docker//container:image.bzl", "container_image")
load("@package_bundle//file:packages.bzl", "packages")

container_image(
    name = "java_base_image",
    base = "@distroless//java:java8",
    env = {
        "LANG": "en_US.UTF-8",
        "TZ": "America/New_York",
    },
    symlinks = {
        "/etc/localtime": "/usr/share/zoneinfo/America/New_York",
    },
    debs = [
        packages["base-files"],
        packages["ca-certificates"],
        packages["openjdk-8-jre-headless"],
        packages["openssl"],
        packages["python2.7-minimal"],
        packages["libc6"],
        packages["libgcc1"],
        packages["libgomp1"],
        packages["libpython2.7-minimal"],
        packages["libpython2.7-stdlib"],
        packages["libssl1.1"],
        packages["libstdc++6"],
        packages["netbase"],
        packages["tzdata"],
        packages["zlib1g"],
    ],
)
package(default_visibility = ["//visibility:public"])

load("@io_bazel_rules_docker//container:image.bzl", "container_image")

container_image(
    name = "kubernetes-with-bazel",
    base = "//kubernetes/images:java_base_image",
    files = ["//src:Main_deploy.jar"],
    cmd = ["Main_deploy.jar"],
    ports = ["4567"],
)
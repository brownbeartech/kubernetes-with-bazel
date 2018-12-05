package(default_visibility = ["//visibility:public"])

java_library(
    name = "undertow",
    exports = [
        "@io_undertow_core//jar",
        "@io_undertow_websockets_jsr//jar",
        "@org_jboss_logging//jar",
        "@org_jboss_xnio_api//jar",
        "@org_jboss_xnio_nio//jar",
    ]
)

java_binary(
    name = "Main",
    srcs = glob(["*.java"]),
    main_class = "src.Main",
    deps = [
        ":undertow",
    ],
)
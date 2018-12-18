bazel run //kubernetes/services:kubernetes-with-bazel

kubectl delete -f kubernetes/services/gen/kubernetes-with-bazel.json

jsonnet kubernetes/services/kubernetes-with-bazel.jsonnet > kubernetes/services/gen/kubernetes-with-bazel.json

kubectl apply -f kubernetes/services/gen/kubernetes-with-bazel.json
jsonnet kubernetes/services/kubernetes-with-bazel-backend.jsonnet > kubernetes/services/gen/kubernetes-with-bazel-backend.json

kubectl apply -f kubernetes/services/gen/kubernetes-with-bazel-backend.json

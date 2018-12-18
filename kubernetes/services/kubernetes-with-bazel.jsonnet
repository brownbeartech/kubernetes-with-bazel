{
  apiVersion: 'apps/v1',
  kind: 'Deployment',
  metadata: {
    name: 'kubernetes-with-bazel',
  },
  spec: {
    selector: {
      matchLabels: {
        app: 'kubernetes-with-bazel',
      },
    },
    replicas: 2,
    template: {
      metadata: {
        labels: {
          app: 'kubernetes-with-bazel',
        },
      },
      spec: {
        containers: [
          {
            name: 'hello-world',
            image: 'bazel/kubernetes/services:kubernetes-with-bazel',
            imagePullPolicy: 'IfNotPresent',
            ports: [
              {
                containerPort: 4567,
              },
            ],
            resources: {
              requests: {
                cpu: '100m',
              },
            },
          },
        ],
      },
    },
  },
}
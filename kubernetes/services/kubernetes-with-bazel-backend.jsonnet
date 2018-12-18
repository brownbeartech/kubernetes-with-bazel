{
   apiVersion: 'v1',
   kind: 'Service',
   metadata: {
     name: 'kubernetes-with-bazel-backend',
     labels: {
       app: 'kubernetes-with-bazel',
     },
   },
   spec: {
     type: 'NodePort',
     selector: {
       app: 'kubernetes-with-bazel',
     },
     ports: [
       {
         port: 80,
         targetPort: 4567,
       },
     ],
   }
 }
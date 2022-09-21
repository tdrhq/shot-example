# Screenshotbot integration with pedrovgs/Shot

This example repository demonstrates using Screenshotbot with the
excellent Shot library.

In addition, we also use Firebase to run the Shot tests. This is
configured to run in CircleCI, but you may use any other CI framework
with minor modification to the steps.

See `.circleci/config.yml` to see the steps required for
configuration.

To translate this to a different CI you need to do a few steps

* First, make sure that your image has `gcloud` tool, install it if
  required.

* Call `gcloud auth activate-service-account` to authenticate
  gcloud. You'll need a service user key from the Google Cloud
  console.

* Use `gcloud firebase test android run` to run your Instrumentation
  tests. Use `--directories-to-pull` to pull the images from the
  sdcard. Use `--results-bucket` to specify the google cloud storage
  bucket to store the results in. For now we only support one
  `--device-id` at a time.

* The screenshotbot CLI tool can parse the output from the previous
  command. It can figure out where to pull the screenshots from Google
  Cloud Storage, and delete the artifacts so you don't incur charges.

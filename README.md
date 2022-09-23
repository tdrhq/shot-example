# Screenshotbot integration with pedrovgs/Shot

This example repository demonstrates using [Screenshotbot](https://screenshotbot.io) with the
excellent [Shot](https://github.com/pedrovgs/Shot) library. It's based of the examples in the Shot
repository.

In addition, we also use Firebase to run the Shot tests. This is
configured to run in CircleCI, but you may use any other CI framework
with minor modification to the steps.

See [.circleci/config.yml](.circleci/config.yml) to see the steps required for
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

## Differences from using Shot directly

Since we use Firebase Test Lab, we don't run the Shot tests (using
`./gradlew executeScreenshotTests`). Instead, we ask Firebase to run
the tests, and we pull the screenshots and upload to
Screenshotbot. (Note, the screenshots are *not* stored in the
repository.)

You can see an example run here: https://screenshotbot.io/runs/632b758108394e6f1ee49ff5

You can see a test Pull Request here: https://github.com/tdrhq/shot-example/pull/1

The pull request created a public report. You can either click the
link to that report from the build status on Pull Request, of click
this direct link: https://screenshotbot.io/report/632ccfc208394e6f1ee4ad2b

(If it's been a while since we've modified this README file, let us
know if any of the above links are broken at support@screenshotbot.io)

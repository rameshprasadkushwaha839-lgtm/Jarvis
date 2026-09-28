# Build JARVIS on a phone (cloud build)

You do not need a laptop for the build itself.

1. Create a GitHub account (if you do not already have one).
2. In your browser, create a new repository, for example `jarvis-answer-ai`.
3. Upload ALL files and folders from this project, including `.github/workflows/build-aab.yml`.
4. Open the repository's **Actions** tab and select **Build JARVIS AAB**.
5. Tap **Run workflow** (or wait for the push workflow to run).
6. When it finishes, open the workflow run and download the artifact named `JARVIS-release-AAB`.

Important:
- This workflow builds an **unsigned release AAB**. Google Play requires a signed release for publishing.
- For the final Play Store release, use Play App Signing / a secure signing setup and keep your upload key safe.
- The generated AAB is for building/testing the release package; it is not itself a guarantee that Play Console will accept the app.

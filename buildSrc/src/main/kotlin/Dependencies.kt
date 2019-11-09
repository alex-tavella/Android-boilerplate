import org.gradle.api.JavaVersion

object Config {
  const val minSdk = 21
  const val compileSdk = 29
  const val targetSdk = 29
  val javaVersion = JavaVersion.VERSION_1_8
  const val buildTools = "29.0.0"
}

object Versions {
  const val androidx_core = "1.2.0-beta02"
  const val androidx_viewmodel = "2.1.0-beta01"
  const val androidx_lifecycle = "2.2.0-alpha01"
  const val androidx_recyclerview = "1.1.0-rc01"
  const val androidx_constraintLayout = "2.0.0-beta3"
  const val material = "1.2.0-alpha01"
  const val play_core_ktx = "1.6.4"
  const val coroutines = "1.3.2"
  const val dagger = "2.25.2"
  const val timber = "4.7.1"

  const val junit = "4.12"
  const val mockk = "1.9.3"
  const val kotest = "3.4.2"
  const val androidx_espresso = "3.1.0"
  const val androidx_testing = "1.1.1"

  const val gradleandroid = "3.5.2"
  const val kotlin = "1.3.50"
  const val gradleversions = "0.27.0"
}

object Deps {
  const val androidx_core = "androidx.core:core-ktx:${Versions.androidx_core}"
  const val androidx_lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.androidx_lifecycle}"
  const val androidx_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidx_viewmodel}"
  const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraintLayout}"
  const val androidx_material = "com.google.android.material:material:${Versions.material}"
  const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview}"
  const val play_core_ktx = "com.google.android.play:core-ktx:${Versions.play_core_ktx}"
  const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
  const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
  const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
  const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

  const val testlib_junit = "junit:junit:${Versions.junit}"
  const val mockk = "io.mockk:mockk:${Versions.mockk}"
  const val kotest = "io.kotlintest:kotlintest-runner-junit5:${Versions.kotest}"
  const val testandroidx_rules = "androidx.test:rules:${Versions.androidx_testing}"
  const val testandroidx_runner = "androidx.test:runner:${Versions.androidx_testing}"
  const val testandroidx_espressocore = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso}"

  const val tools_gradleandroid = "com.android.tools.build:gradle:${Versions.gradleandroid}"
  const val tools_kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val tools_gradleversions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleversions}"
}

import sbt._, Keys._

object ObfuscatePlugin extends sbt.AutoPlugin {
  object autoImport {
    lazy val obfuscateStylesheet = settingKey[File]("obfuscate stylesheet")
  }
}

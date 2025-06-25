sealed class Build {

    open val isMinifyEnabled = false
    open val enableUnitTestCoverage = false
    open val isDebuggable = false
    open val applicationIdSuffix = ""
    open val versionNameSuffix = ""

    object Debug : Build() {
        override val isMinifyEnabled: Boolean = false
        override val enableUnitTestCoverage: Boolean = true
        override val isDebuggable: Boolean = true
        override val versionNameSuffix: String = "-DEBUG"
        override val applicationIdSuffix: String = ".debug"
    }

    object ReleaseExternalQA : Build() {
        override val isMinifyEnabled: Boolean = false
        override val enableUnitTestCoverage: Boolean = true
        override val isDebuggable: Boolean = false
        override val versionNameSuffix: String = "-QA"
        override val applicationIdSuffix: String = ".releaseExternalQA"
    }

    object Release : Build() {
        override val isMinifyEnabled: Boolean = true
        override val enableUnitTestCoverage: Boolean = false
        override val isDebuggable: Boolean = false
    }


}
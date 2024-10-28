package host.carbon.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Exec

class CarbonPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register("deploy", Exec::class.java) {
            group = "Carbon"
            description = "Runs the carbon deploy command"

            commandLine("carbon", "deploy")
        }
    }
}
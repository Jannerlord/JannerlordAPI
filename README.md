# JannerlordAPI
Jannerlord's Java API for making mods.

## Setup

<details>
<summary>Gradle</summary>

```gradle
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.portlek:jannerlord:${version}")
}
```
</details>

<details>
<summary>Maven</summary>

```xml
<dependencies>
    <dependency>
      <groupId>io.github.portlek</groupId>
      <artifactId>jannerlord</artifactId>
      <version>${version}</version>
    </dependency>
</dependencies>
```
</details>

## Example Usage
```java
@Module(
    name = "TestMod",
    id = "TestMod",
    version = "v1.0.0",
    singlePlayer = true,
    multiPlayer = false,
    dependencies = {
        @Dependency("Native"),
        @Dependency("SandBoxCore"),
        @Dependency("CustomBattle"),
        @Dependency("Sandbox"),
        @Dependency("StoryMode")
    },
    subModules = {
        @SubModule(
            name = "TestSubModule",
            dllName = "TestSubModule.dll",
            tags = {
                @Tag(
                    key = "DedicatedServerType",
                    value = "none"
                ),
                @Tag(
                    key = "IsNoRenderModeElement",
                    value = "false"
                )
            }
        )
    }
)
public final class TestMod implements Mod {

    

}
```

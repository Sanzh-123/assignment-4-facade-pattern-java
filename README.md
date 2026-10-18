## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


# Media Conversion Facade Pattern Assignment

Java implementation of the **Facade** structural design pattern based on Option A (Media/File Conversion).

## Project Structure
- `src/subsystem/`: Contains low-level subsystem classes (`MetadataReader`, `CodecFactory`, `BitrateReader`, `AudioMixer`).
- `src/facade/`: Contains the wrapper class (`MediaConversionFacade`) simplifying access.
- `src/client/`: Contains the entry point (`Client`) demonstrating clean decoupling.
- `docs/`: Contains project documentation and report files.

## How to Compile & Run
1. Navigate to the `src` directory.
2. Compile all java files:
   ```bash
   javac client/Client.java facade/*.java subsystem/*.java

## Documentation & Report
- [Download Report (PDF)](docs/Report.pdf)
- [Download Report (DOCX)](docs/Report.docx)
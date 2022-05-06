# Chapter 11: Modules

## Introduce

- The module-info file must be in the root directory of your module.  Regular Java classes should be in packages.
- The module-info file must use the keyword module instead of class, interface, or enum.
- The module name follows the naming rules for package names. It often includes periods (.) in its name. Regular class and package names are not allowed to have dashes (-). Module names follow the same rule.

``` powershell
javac --module-path mods -d feeding .\feeding\module-info.java .\feeding\zoo\animal\feeding\Task.java

java -p feeding -m zoo.animal.feeding/zoo.animal.feeding.Task

jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .
```

## module-info file

`exports, requires, provides, uses, opens`

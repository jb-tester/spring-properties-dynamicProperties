## Spring Debugger: @DynamicPropertySource properties evaluation fails with SpringBoot 3.4.1

Debug the test class, evaluate the configuration properties:
expected: 
- for the properties set via `@DynamicPropertySource` the correct values should be shown
- for overridden property the actual value should be shown in the `application.properties`

https://youtrack.jetbrains.com/issue/IDEA-365977/Spring-Debugger-DynamicPropertySource-properties-evaluation-fails-with-SpringBoot-3.4.1
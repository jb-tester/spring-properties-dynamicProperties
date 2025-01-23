## Spring Debugger: @DynamicPropertySource properties 

1. evaluation fails with SpringBoot 3.4.1:
Set the 3.4.1 version in pom;
Debug the test class, evaluate the configuration properties:
expected: 
- for the properties set via `@DynamicPropertySource` the correct values should be shown
- for overridden property the actual value should be shown in the `application.properties`

https://youtrack.jetbrains.com/issue/IDEA-365977/Spring-Debugger-DynamicPropertySource-properties-evaluation-fails-with-SpringBoot-3.4.1

2. With SB 3.3 and earlier, navigation to the evaluated property source (Source / Override) 
and via the 'Actual value' inlay fails if the target is set in the `@DynamicPropertySource`
   https://youtrack.jetbrains.com/issue/IDEA-366130/Spring-Debugger-properties-evaluation-navigation-to-source-fails-for-properties-set-in-the-DynamicPropertySource
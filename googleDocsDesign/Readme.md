## A modular LLD for a document editor like Google Docs, engineered for text, images, and for future extensibility.


### Requirements:

1)The system must support rich text editing capabilities, allowing users to create and format text content dynamically.
2)The system must allow for the seamless integration and basic manipulation of images within the document.
3)The system must be scalable in case for future features like allowing videos,gif's etc.


## Index
- [Initial Design](#initial-design)
- [Better Design](#better-design)
- [Final Design](#final-design)


## Initial Design

![alt text](image.png)

->This is the first thought that came to mind after reading the requirements , I'll improve this design later after trying this out once
->Here , renderDocument() is not rendering anything but just returning a string which is being stored in the file by saveToFile()
->Now thinking about this design , it breaks single responsibility and open closed principle both so this is definitely a bad design

## Better Design:







## Final Design


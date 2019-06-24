# how-to-test-legacy-code
Contains Java code examples that describe how to test legacy code

Legacy code is notoriously difficult to work with. It usually involves hacking code that's already been hacked to death; the code is usually lacking in any automation tests (unit tests, integration tests etc). The only level of testing is manually running the application and hoping for the best. 

This style of development makes a *bad* situation *worse*. It adds complexity to already complex code. It reduces the maintainablility of code that is already difficult to maintain. It introduces bugs to the system. It makes change requests (new features, bug fixes) take much longer to implement. Moreover, no one likes working with legacy code!

There is an alternative, however. All good developers know that a system should be self-testing, that you should write unit and integration tests. Well, this can be done with legacy systems, if you know how to mock complicated legacy code, so that you can test the changes you are making.

I won't go into detail (as there's much more to it that getting your changes tested), but you should read [Working Effectively with Legacy Code](https://www.amazon.co.uk/Working-Effectively-Legacy-Michael-Feathers/dp/0131177052). A lot of the "Subclassing" tequniques in this book can be replicated using [PowerMock](https://github.com/powermock/powermock/wiki). This repo contains examples of the techniques that you can use to test legacy code, without having to read the book - but you should still read it as it describes how you can de-legacy your code by refactoring!

Checkout my [Slides](http://slides.com/samuelbentley/working-effectively-with-legacy-code#/) for a more comprehensive discussion!

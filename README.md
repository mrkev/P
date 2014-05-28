P
===================

P stands for printing; it's a class I use for easier debugging in Java.

## Usage

### P.rototyping : boolean

Enables/disables P.rint.

Usage: `P.rototyping = true; // or false`;

### P.rint(String message [, String tag])

Prints a message. Optionally assigns a tag to it, to be used for filtering. Messages with a tag will only be printed if their tag is P.ermitted

Usage: `P.rint("Hello World!");`, `P.rint("Printing", "Main.message");`

### P.ermitted : HashMap<String, Boolean>

A map of tags to wether they will be displayed or not. A P.rint statement with a tag will only be printed if `P.ermitted.get(tag) == true`.

Usage: `P.ermitted.put("Main.message", Boolean.TRUE) // or Boolean.FALSE`

### P.ermitAll(String[] tags)

Adds/sets the value of all elements in `tags` to P.ermitted, and tags them as `true`

Usage: `P.ermitAll(new String[]{"Class.debugging", Class.lifecycle})`

### P.rohibitAll(String[] tags)

Adds/sets the value of all elements in `tags` to P.ermitted, and tags them as `false`

Usage: `P.rohibitAll(new String[]{"Class.debugging", Class.lifecycle})`

*See Examples.java for sample usage. Just import to your project for usage.* 
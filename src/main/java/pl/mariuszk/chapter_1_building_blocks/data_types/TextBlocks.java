package pl.mariuszk.chapter_1_building_blocks.data_types;

public class TextBlocks {

    public TextBlocks() {
        /*
        All whitespace characters before the leftmost non-whitespace character are ignored.
        The below String is printed as:
         "This is a text block"
             Hello World!
        A new line after opening """ is also ignored.
        """ inside a text block can be escaped with \""" or \"\"\".
        " doesn't have to be escaped.
        Spaces at ends of lines are ignored.
        \ at the end of a line omits new line on that line.
        Texts blocks require a new line after the opening """.
        */
        String str = """
                 "This is a text block"
                     Hello World!
                """;
    }
}

module zoo.animal.talks{
    exports zoo.animal.talks.content;
    exports zoo.animal.talks.schedule;
    exports zoo.animal.talks.media;

    requires zoo.animal.feeding;
    requires zoo.animal.care;
}
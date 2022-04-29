package com.company.WzorceProjektowe.IteratorChannel;

public class Main {
    public static void main(String[] args) {

        IChannelCollection channels = new ChannelCollection();

        channels.addChannel(new Channel("MTV"));
        channels.addChannel(new Channel("Sport News"));
        channels.addChannel(new Channel("Eska TV"));

        IChannelIterator iterator = channels.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}

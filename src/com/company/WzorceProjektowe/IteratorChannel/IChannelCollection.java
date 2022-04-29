package com.company.WzorceProjektowe.IteratorChannel;

public interface IChannelCollection {

    void addChannel (Channel channel);

    void removeChannel (Channel channel);

    IChannelIterator iterator();

}

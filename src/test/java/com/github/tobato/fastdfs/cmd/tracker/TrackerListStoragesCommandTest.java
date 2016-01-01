package com.github.tobato.fastdfs.cmd.tracker;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.github.tobato.fastdfs.StorageState;
import com.github.tobato.fastdfs.cmd.CommandTestBase;
import com.github.tobato.fastdfs.cmd.RemoteServiceDefine;

/**
 * 列举存储目录服务器状态
 * 
 * @author wuyf
 *
 */
public class TrackerListStoragesCommandTest extends CommandTestBase {

    @Test
    public void testGroupAndIp() {
        List<StorageState> list = executeTrackerCmd(
                new TrackerListStoragesCommand("group1", RemoteServiceDefine.store_address.getHostString()));
        assertTrue(list.size() > 0);
        LOGGER.debug("-----根据IP列举存储服务器状态处理结果-----");
        LOGGER.debug(list.toString());
    }

    @Test
    public void testGroup() {
        List<StorageState> list = executeTrackerCmd(new TrackerListStoragesCommand("group1"));
        assertTrue(list.size() > 0);
        LOGGER.debug("-----列举存储服务器状态处理结果-----");
        LOGGER.debug(list.toString());
    }

}

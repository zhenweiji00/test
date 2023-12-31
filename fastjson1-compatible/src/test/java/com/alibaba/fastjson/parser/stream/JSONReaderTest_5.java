package com.alibaba.fastjson.parser.stream;

import com.alibaba.fastjson.JSONReader;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JSONReaderTest_5 {
    @Test
    public void test_read() throws Exception {
        final int COUNT = 1000 * 10;
        StringBuilder buf = new StringBuilder();
        buf.append('[');
        for (int i = 0; i < COUNT; ++i) {
            if (i != 0) {
                buf.append(',');
            }
            buf.append("{\"id\":").append(i).append('}');
        }
        buf.append(']');

        JSONReader reader = new JSONReader(new StringReader(buf.toString()));

        reader.startArray();
        Map map = new HashMap();
        int count = 0;
        for (; ; ) {
            if (reader.hasNext()) {
                reader.startObject();
                String key = reader.readString();
                Long value = reader.readLong();
                reader.endObject();
                count++;
            } else {
                break;
            }
        }
        assertEquals(COUNT, count);
        reader.endArray();
        reader.close();
    }
}

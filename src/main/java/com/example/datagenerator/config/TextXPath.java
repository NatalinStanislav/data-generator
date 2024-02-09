package com.example.datagenerator.config;

import com.jcabi.xml.XML;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class TextXPath {
    private final XML xmlFile;
    private final String node;

    @Override
    public String toString() {
        return xmlFile.nodes(node)
                .get(0)
                .xpath("text()")
                .get(0);
    }
}

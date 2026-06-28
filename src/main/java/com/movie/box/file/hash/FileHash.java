package com.movie.box.file.hash;

import com.movie.box.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}

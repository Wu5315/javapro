package com.wu.util;

import java.sql.ResultSet;

public interface RowMap<T> {
    T Rowmathod(ResultSet rs);
}

/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.datasource;

import org.apache.ibatis.type.BlobInputStreamTypeHandler;

import java.util.Properties;

import javax.sql.DataSource;

/**
 * @author Clinton Begin
 */
public interface DataSourceFactory {


  /**
   * 设置 DataSource 对象的属性
   *
   * @param props 属性
   */
  void setProperties(Properties props);

  /**
   * 获得 DataSource 对象
   * 果你对 {@link DataSource} 如何实现分库分表的功能，可以看看 《Sharding-JDBC 源码分析 —— JDBC实现与读写分离》 。
   * @return DataSource 对象
   */
  DataSource getDataSource();

}

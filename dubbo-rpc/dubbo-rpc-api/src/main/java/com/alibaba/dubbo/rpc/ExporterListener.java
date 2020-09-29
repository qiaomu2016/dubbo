/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.rpc;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * ExporterListener. (SPI, Singleton, ThreadSafe)
 */
@SPI
public interface ExporterListener {

    /*
     * 1、本地服务暴露过程：
     *
     * 本地服务暴露过程会按照 ProtocolFilterWrapper -> ProtocolListenerWrapper -> InjvmProtocol 调用顺序，
     * 在 ProtocolListenerWrapper 中会构建 ListenerExporterWrapper 实例，在生成 ListenerExporterWrapper 实例过程中，
     * 会对 ListenerExporterWrapper 实例中的 listeners 属性依次调用 exported 方法。
     *
     * 2、远程服务暴露过程：
     *
     * 远程暴露服务过程会按照 ProtocolFilterWrapper -> ProtocolListenerWrapper -> RegistryProtocol 调用顺序，
     * 在 ProtocolListenerWrapper 中会构建 ListenerExporterWrapper 实例，在生成 ListenerExporterWrapper 实例过程中，
     * 会对 ListenerExporterWrapper 实例中的 listeners 属性依次调用 exported 方法。
     */

    /**
     * The exporter exported.
     * 暴露服务后的监听/处理，在 ListenerExporterWrapper 对象进行初始化的时候就会进行调用
     * @param exporter
     * @throws RpcException
     * @see com.alibaba.dubbo.rpc.Protocol#export(Invoker)
     */
    void exported(Exporter<?> exporter) throws RpcException;

    /**
     * The exporter unexported.
     * 取消暴露服务后的处理
     * @param exporter
     * @throws RpcException
     * @see com.alibaba.dubbo.rpc.Exporter#unexport()
     */
    void unexported(Exporter<?> exporter);

}
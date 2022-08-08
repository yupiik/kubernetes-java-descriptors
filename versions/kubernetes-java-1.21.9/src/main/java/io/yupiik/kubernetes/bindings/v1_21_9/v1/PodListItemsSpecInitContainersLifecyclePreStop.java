package io.yupiik.kubernetes.bindings.v1_21_9.v1;

import java.util.Objects;

public class PodListItemsSpecInitContainersLifecyclePreStop {
    private PodListItemsSpecInitContainersLifecyclePreStopExec exec;
    private PodListItemsSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private PodListItemsSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodListItemsSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePreStop(final PodListItemsSpecInitContainersLifecyclePreStopExec exec,
                                                          final PodListItemsSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                          final PodListItemsSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodListItemsSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodListItemsSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final PodListItemsSpecInitContainersLifecyclePreStop __otherCasted = (PodListItemsSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

package io.yupiik.kubernetes.bindings.v1_17_11.v1;

import java.util.Objects;

public class PodListItemsSpecContainersLifecyclePreStop {
    private PodListItemsSpecContainersLifecyclePreStopExec exec;
    private PodListItemsSpecContainersLifecyclePreStopHttpGet httpGet;
    private PodListItemsSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodListItemsSpecContainersLifecyclePreStop() {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePreStop(final PodListItemsSpecContainersLifecyclePreStopExec exec,
                                                      final PodListItemsSpecContainersLifecyclePreStopHttpGet httpGet,
                                                      final PodListItemsSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodListItemsSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodListItemsSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecContainersLifecyclePreStop)) {
            return false;
        }
        final PodListItemsSpecContainersLifecyclePreStop __otherCasted = (PodListItemsSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

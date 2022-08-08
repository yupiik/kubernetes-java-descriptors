package io.yupiik.kubernetes.bindings.v1_18_16;

import java.util.Objects;

public class PodListItemsSpecContainersLifecyclePostStart {
    private PodListItemsSpecContainersLifecyclePostStartExec exec;
    private PodListItemsSpecContainersLifecyclePostStartHttpGet httpGet;
    private PodListItemsSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodListItemsSpecContainersLifecyclePostStart() {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePostStart(final PodListItemsSpecContainersLifecyclePostStartExec exec,
                                                        final PodListItemsSpecContainersLifecyclePostStartHttpGet httpGet,
                                                        final PodListItemsSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodListItemsSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodListItemsSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodListItemsSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecContainersLifecyclePostStart)) {
            return false;
        }
        final PodListItemsSpecContainersLifecyclePostStart __otherCasted = (PodListItemsSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

package io.yupiik.kubernetes.bindings.v1_19_13;

import java.util.Objects;

public class PodListItemsSpecInitContainersLifecyclePostStart {
    private PodListItemsSpecInitContainersLifecyclePostStartExec exec;
    private PodListItemsSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private PodListItemsSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodListItemsSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePostStart(final PodListItemsSpecInitContainersLifecyclePostStartExec exec,
                                                            final PodListItemsSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                            final PodListItemsSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodListItemsSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodListItemsSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodListItemsSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final PodListItemsSpecInitContainersLifecyclePostStart __otherCasted = (PodListItemsSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

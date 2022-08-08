package io.yupiik.kubernetes.bindings.v1_17_8;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLifecyclePostStart {
    private PodListItemsSpecEphemeralContainersLifecyclePostStartExec exec;
    private PodListItemsSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private PodListItemsSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodListItemsSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecyclePostStart(final PodListItemsSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                 final PodListItemsSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                 final PodListItemsSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodListItemsSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodListItemsSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLifecyclePostStart __otherCasted = (PodListItemsSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

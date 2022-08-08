package io.yupiik.kubernetes.bindings.v1_20_7.v1;

import java.util.Objects;

public class PodListItemsSpecEphemeralContainersLifecyclePreStop {
    private PodListItemsSpecEphemeralContainersLifecyclePreStopExec exec;
    private PodListItemsSpecEphemeralContainersLifecyclePreStopHttpGet httpGet;
    private PodListItemsSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodListItemsSpecEphemeralContainersLifecyclePreStop() {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecyclePreStop(final PodListItemsSpecEphemeralContainersLifecyclePreStopExec exec,
                                                               final PodListItemsSpecEphemeralContainersLifecyclePreStopHttpGet httpGet,
                                                               final PodListItemsSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodListItemsSpecEphemeralContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodListItemsSpecEphemeralContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodListItemsSpecEphemeralContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodListItemsSpecEphemeralContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodListItemsSpecEphemeralContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodListItemsSpecEphemeralContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodListItemsSpecEphemeralContainersLifecyclePreStop)) {
            return false;
        }
        final PodListItemsSpecEphemeralContainersLifecyclePreStop __otherCasted = (PodListItemsSpecEphemeralContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

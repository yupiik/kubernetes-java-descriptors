package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop {
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec exec;
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                          final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                          final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart {
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec exec;
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                            final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                            final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart __otherCasted = (PodTemplateListItemsTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

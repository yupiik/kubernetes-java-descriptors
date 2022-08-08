package io.yupiik.kubernetes.bindings.v1_18_19.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersLifecyclePostStart {
    private PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec exec;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private PodTemplateListItemsTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStart(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec exec,
                                                                        final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                        final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public PodTemplateListItemsTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final PodTemplateListItemsTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersLifecyclePostStart __otherCasted = (PodTemplateListItemsTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

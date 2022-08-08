package io.yupiik.kubernetes.bindings.v1_16_15.v1beta2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart {
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                                final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                                final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

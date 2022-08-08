package io.yupiik.kubernetes.bindings.v1_15_4.v1beta2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop {
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                              final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (StatefulSetListItemsSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}

package io.yupiik.kubernetes.bindings.v1_16_0.v1;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumes {
    private StatefulSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private StatefulSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk;
    private StatefulSetListItemsSpecTemplateSpecVolumesAzureFile azureFile;
    private StatefulSetListItemsSpecTemplateSpecVolumesCephfs cephfs;
    private StatefulSetListItemsSpecTemplateSpecVolumesCinder cinder;
    private StatefulSetListItemsSpecTemplateSpecVolumesConfigMap configMap;
    private StatefulSetListItemsSpecTemplateSpecVolumesCsi csi;
    private StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI;
    private StatefulSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir;
    private StatefulSetListItemsSpecTemplateSpecVolumesFc fc;
    private StatefulSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume;
    private StatefulSetListItemsSpecTemplateSpecVolumesFlocker flocker;
    private StatefulSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private StatefulSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo;
    private StatefulSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs;
    private StatefulSetListItemsSpecTemplateSpecVolumesHostPath hostPath;
    private StatefulSetListItemsSpecTemplateSpecVolumesIscsi iscsi;
    private String name;
    private StatefulSetListItemsSpecTemplateSpecVolumesNfs nfs;
    private StatefulSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private StatefulSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private StatefulSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume;
    private StatefulSetListItemsSpecTemplateSpecVolumesProjected projected;
    private StatefulSetListItemsSpecTemplateSpecVolumesQuobyte quobyte;
    private StatefulSetListItemsSpecTemplateSpecVolumesRbd rbd;
    private StatefulSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO;
    private StatefulSetListItemsSpecTemplateSpecVolumesSecret secret;
    private StatefulSetListItemsSpecTemplateSpecVolumesStorageos storageos;
    private StatefulSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume;

    public StatefulSetListItemsSpecTemplateSpecVolumes() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumes(final StatefulSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesAzureFile azureFile,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesCephfs cephfs,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesCinder cinder,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesConfigMap configMap,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesCsi csi,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesFc fc,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesFlocker flocker,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesHostPath hostPath,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesIscsi iscsi,
                                                       final String name,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesNfs nfs,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesProjected projected,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesQuobyte quobyte,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesRbd rbd,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesSecret secret,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesStorageos storageos,
                                                       final StatefulSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final StatefulSetListItemsSpecTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final StatefulSetListItemsSpecTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final StatefulSetListItemsSpecTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final StatefulSetListItemsSpecTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final StatefulSetListItemsSpecTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final StatefulSetListItemsSpecTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final StatefulSetListItemsSpecTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final StatefulSetListItemsSpecTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final StatefulSetListItemsSpecTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final StatefulSetListItemsSpecTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final StatefulSetListItemsSpecTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final StatefulSetListItemsSpecTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final StatefulSetListItemsSpecTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final StatefulSetListItemsSpecTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final StatefulSetListItemsSpecTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final StatefulSetListItemsSpecTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final StatefulSetListItemsSpecTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final StatefulSetListItemsSpecTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final StatefulSetListItemsSpecTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final StatefulSetListItemsSpecTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final StatefulSetListItemsSpecTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final StatefulSetListItemsSpecTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final StatefulSetListItemsSpecTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final StatefulSetListItemsSpecTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final StatefulSetListItemsSpecTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final StatefulSetListItemsSpecTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final StatefulSetListItemsSpecTemplateSpecVolumesVsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                awsElasticBlockStore,
                azureDisk,
                azureFile,
                cephfs,
                cinder,
                configMap,
                csi,
                downwardAPI,
                emptyDir,
                fc,
                flexVolume,
                flocker,
                gcePersistentDisk,
                gitRepo,
                glusterfs,
                hostPath,
                iscsi,
                name,
                nfs,
                persistentVolumeClaim,
                photonPersistentDisk,
                portworxVolume,
                projected,
                quobyte,
                rbd,
                scaleIO,
                secret,
                storageos,
                vsphereVolume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumes)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumes __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(fc, __otherCasted.fc) &&
            Objects.equals(flexVolume, __otherCasted.flexVolume) &&
            Objects.equals(flocker, __otherCasted.flocker) &&
            Objects.equals(gcePersistentDisk, __otherCasted.gcePersistentDisk) &&
            Objects.equals(gitRepo, __otherCasted.gitRepo) &&
            Objects.equals(glusterfs, __otherCasted.glusterfs) &&
            Objects.equals(hostPath, __otherCasted.hostPath) &&
            Objects.equals(iscsi, __otherCasted.iscsi) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(nfs, __otherCasted.nfs) &&
            Objects.equals(persistentVolumeClaim, __otherCasted.persistentVolumeClaim) &&
            Objects.equals(photonPersistentDisk, __otherCasted.photonPersistentDisk) &&
            Objects.equals(portworxVolume, __otherCasted.portworxVolume) &&
            Objects.equals(projected, __otherCasted.projected) &&
            Objects.equals(quobyte, __otherCasted.quobyte) &&
            Objects.equals(rbd, __otherCasted.rbd) &&
            Objects.equals(scaleIO, __otherCasted.scaleIO) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(storageos, __otherCasted.storageos) &&
            Objects.equals(vsphereVolume, __otherCasted.vsphereVolume);
    }
}

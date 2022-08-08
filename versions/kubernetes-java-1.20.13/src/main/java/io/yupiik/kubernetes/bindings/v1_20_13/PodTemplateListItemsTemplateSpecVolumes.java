package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumes {
    private PodTemplateListItemsTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore;
    private PodTemplateListItemsTemplateSpecVolumesAzureDisk azureDisk;
    private PodTemplateListItemsTemplateSpecVolumesAzureFile azureFile;
    private PodTemplateListItemsTemplateSpecVolumesCephfs cephfs;
    private PodTemplateListItemsTemplateSpecVolumesCinder cinder;
    private PodTemplateListItemsTemplateSpecVolumesConfigMap configMap;
    private PodTemplateListItemsTemplateSpecVolumesCsi csi;
    private PodTemplateListItemsTemplateSpecVolumesDownwardAPI downwardAPI;
    private PodTemplateListItemsTemplateSpecVolumesEmptyDir emptyDir;
    private PodTemplateListItemsTemplateSpecVolumesEphemeral ephemeral;
    private PodTemplateListItemsTemplateSpecVolumesFc fc;
    private PodTemplateListItemsTemplateSpecVolumesFlexVolume flexVolume;
    private PodTemplateListItemsTemplateSpecVolumesFlocker flocker;
    private PodTemplateListItemsTemplateSpecVolumesGcePersistentDisk gcePersistentDisk;
    private PodTemplateListItemsTemplateSpecVolumesGitRepo gitRepo;
    private PodTemplateListItemsTemplateSpecVolumesGlusterfs glusterfs;
    private PodTemplateListItemsTemplateSpecVolumesHostPath hostPath;
    private PodTemplateListItemsTemplateSpecVolumesIscsi iscsi;
    private String name;
    private PodTemplateListItemsTemplateSpecVolumesNfs nfs;
    private PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim;
    private PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk;
    private PodTemplateListItemsTemplateSpecVolumesPortworxVolume portworxVolume;
    private PodTemplateListItemsTemplateSpecVolumesProjected projected;
    private PodTemplateListItemsTemplateSpecVolumesQuobyte quobyte;
    private PodTemplateListItemsTemplateSpecVolumesRbd rbd;
    private PodTemplateListItemsTemplateSpecVolumesScaleIO scaleIO;
    private PodTemplateListItemsTemplateSpecVolumesSecret secret;
    private PodTemplateListItemsTemplateSpecVolumesStorageos storageos;
    private PodTemplateListItemsTemplateSpecVolumesVsphereVolume vsphereVolume;

    public PodTemplateListItemsTemplateSpecVolumes() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumes(final PodTemplateListItemsTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore,
                                                   final PodTemplateListItemsTemplateSpecVolumesAzureDisk azureDisk,
                                                   final PodTemplateListItemsTemplateSpecVolumesAzureFile azureFile,
                                                   final PodTemplateListItemsTemplateSpecVolumesCephfs cephfs,
                                                   final PodTemplateListItemsTemplateSpecVolumesCinder cinder,
                                                   final PodTemplateListItemsTemplateSpecVolumesConfigMap configMap,
                                                   final PodTemplateListItemsTemplateSpecVolumesCsi csi,
                                                   final PodTemplateListItemsTemplateSpecVolumesDownwardAPI downwardAPI,
                                                   final PodTemplateListItemsTemplateSpecVolumesEmptyDir emptyDir,
                                                   final PodTemplateListItemsTemplateSpecVolumesEphemeral ephemeral,
                                                   final PodTemplateListItemsTemplateSpecVolumesFc fc,
                                                   final PodTemplateListItemsTemplateSpecVolumesFlexVolume flexVolume,
                                                   final PodTemplateListItemsTemplateSpecVolumesFlocker flocker,
                                                   final PodTemplateListItemsTemplateSpecVolumesGcePersistentDisk gcePersistentDisk,
                                                   final PodTemplateListItemsTemplateSpecVolumesGitRepo gitRepo,
                                                   final PodTemplateListItemsTemplateSpecVolumesGlusterfs glusterfs,
                                                   final PodTemplateListItemsTemplateSpecVolumesHostPath hostPath,
                                                   final PodTemplateListItemsTemplateSpecVolumesIscsi iscsi,
                                                   final String name,
                                                   final PodTemplateListItemsTemplateSpecVolumesNfs nfs,
                                                   final PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim,
                                                   final PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk,
                                                   final PodTemplateListItemsTemplateSpecVolumesPortworxVolume portworxVolume,
                                                   final PodTemplateListItemsTemplateSpecVolumesProjected projected,
                                                   final PodTemplateListItemsTemplateSpecVolumesQuobyte quobyte,
                                                   final PodTemplateListItemsTemplateSpecVolumesRbd rbd,
                                                   final PodTemplateListItemsTemplateSpecVolumesScaleIO scaleIO,
                                                   final PodTemplateListItemsTemplateSpecVolumesSecret secret,
                                                   final PodTemplateListItemsTemplateSpecVolumesStorageos storageos,
                                                   final PodTemplateListItemsTemplateSpecVolumesVsphereVolume vsphereVolume) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesAwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(final PodTemplateListItemsTemplateSpecVolumesAwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    public PodTemplateListItemsTemplateSpecVolumesAzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(final PodTemplateListItemsTemplateSpecVolumesAzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    public PodTemplateListItemsTemplateSpecVolumesAzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(final PodTemplateListItemsTemplateSpecVolumesAzureFile azureFile) {
        this.azureFile = azureFile;
    }

    public PodTemplateListItemsTemplateSpecVolumesCephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(final PodTemplateListItemsTemplateSpecVolumesCephfs cephfs) {
        this.cephfs = cephfs;
    }

    public PodTemplateListItemsTemplateSpecVolumesCinder getCinder() {
        return cinder;
    }

    public void setCinder(final PodTemplateListItemsTemplateSpecVolumesCinder cinder) {
        this.cinder = cinder;
    }

    public PodTemplateListItemsTemplateSpecVolumesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodTemplateListItemsTemplateSpecVolumesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodTemplateListItemsTemplateSpecVolumesCsi getCsi() {
        return csi;
    }

    public void setCsi(final PodTemplateListItemsTemplateSpecVolumesCsi csi) {
        this.csi = csi;
    }

    public PodTemplateListItemsTemplateSpecVolumesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodTemplateListItemsTemplateSpecVolumesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodTemplateListItemsTemplateSpecVolumesEmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(final PodTemplateListItemsTemplateSpecVolumesEmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    public PodTemplateListItemsTemplateSpecVolumesEphemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(final PodTemplateListItemsTemplateSpecVolumesEphemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    public PodTemplateListItemsTemplateSpecVolumesFc getFc() {
        return fc;
    }

    public void setFc(final PodTemplateListItemsTemplateSpecVolumesFc fc) {
        this.fc = fc;
    }

    public PodTemplateListItemsTemplateSpecVolumesFlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(final PodTemplateListItemsTemplateSpecVolumesFlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    public PodTemplateListItemsTemplateSpecVolumesFlocker getFlocker() {
        return flocker;
    }

    public void setFlocker(final PodTemplateListItemsTemplateSpecVolumesFlocker flocker) {
        this.flocker = flocker;
    }

    public PodTemplateListItemsTemplateSpecVolumesGcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(final PodTemplateListItemsTemplateSpecVolumesGcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    public PodTemplateListItemsTemplateSpecVolumesGitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(final PodTemplateListItemsTemplateSpecVolumesGitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    public PodTemplateListItemsTemplateSpecVolumesGlusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(final PodTemplateListItemsTemplateSpecVolumesGlusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    public PodTemplateListItemsTemplateSpecVolumesHostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(final PodTemplateListItemsTemplateSpecVolumesHostPath hostPath) {
        this.hostPath = hostPath;
    }

    public PodTemplateListItemsTemplateSpecVolumesIscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(final PodTemplateListItemsTemplateSpecVolumesIscsi iscsi) {
        this.iscsi = iscsi;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PodTemplateListItemsTemplateSpecVolumesNfs getNfs() {
        return nfs;
    }

    public void setNfs(final PodTemplateListItemsTemplateSpecVolumesNfs nfs) {
        this.nfs = nfs;
    }

    public PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(final PodTemplateListItemsTemplateSpecVolumesPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(final PodTemplateListItemsTemplateSpecVolumesPhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    public PodTemplateListItemsTemplateSpecVolumesPortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(final PodTemplateListItemsTemplateSpecVolumesPortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    public PodTemplateListItemsTemplateSpecVolumesProjected getProjected() {
        return projected;
    }

    public void setProjected(final PodTemplateListItemsTemplateSpecVolumesProjected projected) {
        this.projected = projected;
    }

    public PodTemplateListItemsTemplateSpecVolumesQuobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(final PodTemplateListItemsTemplateSpecVolumesQuobyte quobyte) {
        this.quobyte = quobyte;
    }

    public PodTemplateListItemsTemplateSpecVolumesRbd getRbd() {
        return rbd;
    }

    public void setRbd(final PodTemplateListItemsTemplateSpecVolumesRbd rbd) {
        this.rbd = rbd;
    }

    public PodTemplateListItemsTemplateSpecVolumesScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(final PodTemplateListItemsTemplateSpecVolumesScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    public PodTemplateListItemsTemplateSpecVolumesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodTemplateListItemsTemplateSpecVolumesSecret secret) {
        this.secret = secret;
    }

    public PodTemplateListItemsTemplateSpecVolumesStorageos getStorageos() {
        return storageos;
    }

    public void setStorageos(final PodTemplateListItemsTemplateSpecVolumesStorageos storageos) {
        this.storageos = storageos;
    }

    public PodTemplateListItemsTemplateSpecVolumesVsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(final PodTemplateListItemsTemplateSpecVolumesVsphereVolume vsphereVolume) {
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
                ephemeral,
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumes)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumes __otherCasted = (PodTemplateListItemsTemplateSpecVolumes) __other;
        return Objects.equals(awsElasticBlockStore, __otherCasted.awsElasticBlockStore) &&
            Objects.equals(azureDisk, __otherCasted.azureDisk) &&
            Objects.equals(azureFile, __otherCasted.azureFile) &&
            Objects.equals(cephfs, __otherCasted.cephfs) &&
            Objects.equals(cinder, __otherCasted.cinder) &&
            Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(csi, __otherCasted.csi) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(emptyDir, __otherCasted.emptyDir) &&
            Objects.equals(ephemeral, __otherCasted.ephemeral) &&
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
